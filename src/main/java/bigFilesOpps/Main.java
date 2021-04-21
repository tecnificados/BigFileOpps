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
		
		if (args.length==2)
		{
			String stringToSearch=args[1];
			File fileToProcess=new File(args[0]);
			if (fileToProcess.exists())
			{
				Util.readFile(fileToProcess.getAbsolutePath(), stringToSearch);
			}else {
				logger.info("Fichero no encontrado");
			}
		}else {
			logger.error("Me tienes que pasar la ruta del fichero y la cadena a buscar como argumentos.");
			logger.error("\t c:\\datos\\bigFile.csv tuemail@loquesea.com");
			logger.error("\t /tmp/datos/bigFile.csv guybrush");
		}
			

		logger.info("Fin");
	}
}
