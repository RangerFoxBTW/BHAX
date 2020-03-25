import java.io.InputStream;
import java.io.OutputStream;

public class main{
    public static void encode(String key, InputStream in, OutputStream out)
    throws java.io.IOException
    {
        byte[] thekey = key.getBytes();
        byte[] inputBuffer = new byte[256];
        int keyIndex = 0;
        int readBytes = 0;

        while((readBytes = in.read(inputBuffer)) != -1)
        {
            for(int i=0; i<readBytes; i++)
            {
                inputBuffer[i] = (byte)(inputBuffer[i] ^ thekey[keyIndex]);
                keyIndex = (keyIndex + 1) % key.length();
            }
            out.write(inputBuffer, 0, readBytes);
        }
    }

    public static void main(String[] args){
        if(args[0] != "")
        {
            try
            {
                encode(args[0], System.in, System.out);
            }
            catch(java.io.IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Adj meg egy kulcsot!");
            System.out.println("java main <key>");
        }
    }
}