import org.eclipse.paho.client.mqttv3.MqttCilent;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;


public class MqttExample {
  public static viod main(String[] args) {
    String topic = "temp and humidity";
    String content = "T = 30C and RH=40%";
    int qos = 2;
    String broker = "tcp://iot.eclipse.org:1883";
    String clientId = "JavaMQTTExample";
    MemoryPersistence persistence = new MemoryPersistence();

    try{
      MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
      MqttConnectOptions connOpts = new MqttConnectOptions();
      conOpts.setCleanSession(true);
      System.out.println("connecting to broker: " + broker);
      sampleClient.connect(connOpts);
      System.out.println("connected");
      System.out.println("publishign mesage: " + content);
      MqttMessage message = new MqttMessage(content.getBytes());
      message.setQos(qos);
      sampleClient.publish(topic, message);
      System.out.println("message published");
      sampleClient.disconnect();
      System.out.println("disconnectd");
      System.exit(0);
    } catch (MqttException me) {
      me.printStackTrace();
    }
  }
}
