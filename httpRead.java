import java.io.IOException;

public class httpRead {


    private String command;

    public httpRead(String command)
    {
        this.command=command;
    }
    public String returnMSG;
    public void http() throws IOException {

        if (isValid())
        {
            //FIND FILE AND SET returnMSG = FILE CONTENTS WITH A VALID HEADER
        }
        else
            {
           //SET returnMSG = ERROR MESSAGE
            }
    }
    public String response()
    {
        return returnMSG;

    }

    public boolean isValid()
    {
        boolean valid=true;
        //DETERMINE IF COMMAND IS VALID HTTP
        setHeader(valid);
        return valid;

    }

    public String setHeader(boolean valid)
    {
        int code=200;
        String phrase="OK";
        if (valid!=true)
        {
            //CHANGE CODE TO REFLECT CORRECT ERROR
            //CHANGE PHRASE TO BE NOT OK
        }

        String returncode=Integer.toString(code);
        returnMSG+= "HTTP/1.0"+returncode+phrase;
        return returnMSG;
    }
}
