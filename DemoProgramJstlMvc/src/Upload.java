import javax.servlet.http.Part;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.http.Part;

public class Upload {
public static void Attachment(Part filePart, String fileName){
	 OutputStream output;
     InputStream filecontent;
     
     try{
         File dir = new File("C:/Users/Anand Acharya/Downloads");
                    if (!dir.exists()) {
                     dir.mkdirs();
                     }
        output = new FileOutputStream(new File(dir + File.separator + fileName));
        filecontent = filePart.getInputStream();
        int read;
        final byte[] bytes = new byte[1024];
        while ((read = filecontent.read(bytes))!=-1){
            output.write(bytes, 0, read);
        }
        output.close();
        filecontent.close();
        } catch (Exception e) {
         System.out.println(e);
     }
	
}
}
