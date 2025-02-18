//ex 8.4; weka test program- simple machine learning example

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.NominalPrediction;

import weka.classifiers.trees.J48;
import weka.core.FastVector;
import weka.core.Instances;

public class WekaTest {
  public static BufferedReader readDataFile(String filename){
    BufferedReader inputReader = null;
    try {
      inputReader = new BufferedReader(new FileReader(filename));
    } catch (FileNotFoundExceptioni ex) {
      System.err.println("file not found:" + filename);
    }
    return inputReader;
  }
  public static Evaluation classify(Classifier model,Instances trainingSet, Instances testingSet) throws Exception {
    Evaluation evaluation = new Evaluation(trainingSet);

    model.buildClassifier(trainingSet);
    evaluation.evaluateModel(model, testingSet);
    return evaluation;
  }

  public static double calculateAccuracy(FastVector predictions) {
    double correct = 0; 
    for(int i = 0; i < predictions.size(); i++) {
      NominalPrediction np = (NominalPrediction) predictions.elementAt(i);
      if(np.predicted() == np.actual()) {
        correct++;
      }
    }
    return 100 * correct / predictions.size();
  }
  public static Instances[][] crossValidationSplit(Instances data, int numberOfFolds) {
    Instances[][] split = new Instances[2][numberOfFolds];
    for(int i = 0; i < numberOfFolds;i++) {
      split[0][i] = data.trainCV(numberOfFolds, i);
      split[1][i] = data.testCV(numberOfFolds, i);
    }
    return split;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader datafile = readDataFile("iris.arff");
    Instances data = new Instances(datafile);
    data.setClassIndex(data.numAttributes() - 1);

    Instances[][] split = crossaValidationSplit(data, 10);
    Instances[] trainingSplits= split[0];
    Instances[] testingSplits = split[1];

    Classifier models = new J48();
    FasVector predictions = new FastVector();
    for(int i = 0; i < traningSplits.length; i++) {
      Evaluation validation = classify(models, trainingSplits[i], testingSplits[i]);
      predictions.appendElements(validation.predictions());
    }
    double accuracy = calculateAccuracy(predictions);
    System.out.println("accuracy of " + models.getClass().getSimpleName() + ": " + String.format("%.2f%%", accuracy) + "\n-----");
  }
}
