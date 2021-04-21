/**
 * 
 */
package bigFilesOpps;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Juan Carlos Ballesteros (tecnificados.com)
 *
 */
public class Util {
	
	private static final Logger logger = LogManager.getLogger(Util.class);
	
	public static void readFile(String path, String search)		
	{
		File outputFile=new File("output"+new Date().hashCode()+".csv");
		int lineReaded=0;
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
		    inputStream = new FileInputStream(path);
		    sc = new Scanner(inputStream, "UTF-8");
		    logger.info("\tLeyendo fichero...");
		    
		    while (sc.hasNextLine()) {
		        String line = sc.nextLine();	
		        if (line.contains(search))
		        {
		        	FileUtils.writeStringToFile(outputFile, line+System.getProperty("line.separator"), "utf-8",true);
		        }
		        lineReaded++;
		        if (lineReaded%100000==0)
		        {
		        	logger.info("\tline: "+String.format(Constant.FORMATO_NUMERO,lineReaded));
		        }
		    }
		    logger.info("\tFichero leido: "+String.format(Constant.FORMATO_NUMERO,lineReaded)+ " lineas");
		}
		catch (Exception e)
		{
			logger.error("Error leyendo fichero",e);     
		} finally {
		    if (inputStream != null) {
		    	try
		    	{
		    		inputStream.close();
		    	}
		    	catch (Exception internalE)
		    	{
		    		logger.error("Error cerrando fichero",internalE);
		    	}
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
	}

}
