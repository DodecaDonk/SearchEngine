import java.io.IOException;

public class SearchEngine{
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
    
        int port = Integer.parseInt(args[0]);
    
        Server.start(port, new Handler());
    }
}