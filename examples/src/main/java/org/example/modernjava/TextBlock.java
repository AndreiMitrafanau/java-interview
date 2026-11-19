package org.example.modernjava;

public class TextBlock {
    String username = "Alice";
    String topic = "1234";
    String previousContext = "1234";


    String email = """
                Hi %s,
                
                Let's continue our discussion about %s.
                For context, %s
                
                Can you tell me more about what specific aspects of %s you're interested in?
                """.formatted(username, topic, previousContext, topic);

}
