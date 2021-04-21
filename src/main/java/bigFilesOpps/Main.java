/**
 * 
 */
package bigFilesOpps;

import org.apache.logging.log4j.Logger;

import java.io.File;

import org.apache.logging.log4j.LogManager;

/**
 * @author Juan Carlos Ballesteros (tecnificados.com)
 *
 */
public class Main {
	
	private static final Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		
		logger.info("Inicio");

		
		
		if (args.length==1)
		{
			File fileToProcess=new File(args[0]);
			if (fileToProcess.exists())
			{
				Util.readFile(fileToProcess.getAbsolutePath());
			}else {
				logger.info("Fichero no encontrado");
			}
		}else {
			logger.error("Me tienes que pasar la ruta del fichero como argumento.");
			logger.error("\t c:\\datos\\bigFile.csv");
			logger.error("\t /tmp/datos/bigFile.csv");
		}
			

		logger.info("Fin");
	}
}
