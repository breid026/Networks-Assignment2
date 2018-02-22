import java.io.IOException;

public class httpRead {


    private String command;
    int code=200;
    String phrase="OK";
    public httpRead(String command)
    {
        this.command=command;
    }
    public String returnMSG="HTTP/1.0 ";
    public void http() throws IOException {
        boolean found=true;
        if (isValid())
        {
            //FIND FILE AND ADD TO returnMSG
            //IF FILE NOT FOUND CHANGE BOOLEAN FOUND TO FALSE

            if(found!=true)
            {}
        }
        else
        {
            //SEND ERROR MESSAGE OR DO NOTHING?
        }
    }
    public String response()
    {
        String returncode=Integer.toString(code);
        returnMSG+=returncode+" "+phrase+"\n";
        return returnMSG;

    }

    public boolean isValid()
    {
        boolean valid=true;
        //DETERMINE IF COMMAND IS VALID HTTP
        //DETERMINE IF CLIENT HAS AUTHORIZATION
        //CHANGE CODE ACCORDINGLY(200,403,404 etc)
        setHeader(valid);
        return valid;

    }

    public String setHeader(boolean valid)
    {
        if (valid!=true)
        {
            //CHANGE PHRASE TO BE NOT OK
            //CHANGE PHRASE ACCORDINGLY
        }

        return returnMSG;
    }
}
