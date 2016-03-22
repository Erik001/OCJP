package tree.com.logreader.model;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class LogReader {
	
	private static int totalHours;
	private static int totalMinutes;
	private static int totalSecconds;
	public static PrintWriter pw;
	static Console console = System.console();

	private List<Path> getDirectoryListing(Path path) {
		List<Path> logFilesList = new ArrayList();
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, "*.{log}")) {
			for (Path entry : stream) {
				logFilesList.add(entry);
				// System.out.println(entry.getFileName());
			}
		} catch (IOException x) {
			// IOException can never be thrown by the iteration.
			// In this snippet, it can // only be thrown by newDirectoryStream.
			System.err.println(x);
		}
		return logFilesList;
	}

	public static void main(String... args) {
		List<Path> logList = null;
		LogReader lr = new LogReader();
		if(args.length < 1){
			console.writer().println("Favor de capturar la ruta de los logs.");
			System.exit(0);
			
		}
		// logList =
		// lr.getDirectoryListing(Paths.get("\\\\acn052memts01\\newprocessor\\Retail\\Audit"));
		logList = lr.getDirectoryListing(Paths.get(args[0]));
		DateTime timeNow = DateTime.now();
		try {
			pw = new PrintWriter(args[0] + "\\SumarioLog" + timeNow.getYear() + "" + timeNow.getMonthOfYear() + ""
					+ timeNow.getDayOfMonth()+""+timeNow.getMillis()+ ".txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Path logFile : logList) {
			console.writer().printf("%nLeyendo:  " + logFile.getFileName());
			lr.getFileContent(logFile);
		}

		int secconds = totalSecconds % 60;
		int minutes = (totalMinutes + (totalSecconds / 60)) % 60;
		int hours = totalHours + (totalMinutes + (totalSecconds / 60)) / 60;

		console.writer().printf("%n%n Total Horas: " + totalHours + ", Total Minutos: " + totalMinutes + ", Total Segundos: "
				+ totalSecconds + "--------> En Total : " + hours + ":" + minutes + ":" + secconds);
		pw.printf("%n%n Total Horas: " + totalHours + ", Total Minutos: " + totalMinutes + ", Total Segundos: "
				+ totalSecconds + "  --------> Tiempo Total : " + hours + ":" + minutes + ":" + secconds);
		pw.close();
	}

	public Content getFileContent(Path filePath) {
		try (Stream<String> lines = Files.lines(filePath, Charset.forName("Cp1252"))) {
			Optional<String> generadaExito = lines.filter(s -> s.contains("Entrega generada con éxito")).findFirst();
			if (generadaExito.isPresent()) {
				int posIni = generadaExito.toString().lastIndexOf(" = ");
				int posFin = generadaExito.toString().lastIndexOf(" ---");
				String timeString = generadaExito.toString().substring(posIni + 3, posFin);
				DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
				DateTime timeObject = formatter.parseDateTime(timeString);

				pw.printf("%s\t%s%n", filePath.getFileName(), timeString);

				console.writer().printf( " ----> " + timeString + " ----> " + timeObject.getHourOfDay()
								+ ":" + timeObject.getMinuteOfHour() + ":" + timeObject.getSecondOfMinute());
				totalHours += timeObject.getHourOfDay();
				totalMinutes += timeObject.getMinuteOfHour();
				totalSecconds += timeObject.getSecondOfMinute();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
