/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyectolunadepluton;


import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author balva
 */
public class MiProyectoLunaDePluton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
    /* ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)      
      .setOAuthConsumerKey("BNmJ2oaezMC2qciIgkpC33kYq")
  .setOAuthConsumerSecret("1b0xCDy2Qh5nFWeuJjdF1MDcjpVJTh4LSpjTfUKeabacirUOn4")
  .setOAuthAccessToken("708080587068858368-FxuwrHLsox7xVSQRbwjDV14vOpSxNyN")
  .setOAuthAccessTokenSecret("c4gBOfVZL7MwyhI7jVPVrGupnNJAiZAJ2cDE9qp48OVl1");*/
TwitterFactory tf = new TwitterFactory();
Twitter mitwitter = tf.getInstance();   
for(int i =0; i<11150;i++){
Status mistatus= mitwitter.updateStatus("Me la bufa");
System.out.println(mistatus.getText());

}
        }}
