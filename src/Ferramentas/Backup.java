package Ferramentas;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.joda.time.DateTime;

/**
 *
 * @author luxu
 */
public class Backup {
// Constantes da classe

    private static String VERSION = "5.1";
    private static String SEPARATOR = File.separator;
    private static String MYSQL_PATH =
            "C:" + SEPARATOR
            //+ "Program Files (x86)" + SEPARATOR
            + "Program Files" + SEPARATOR
            + "MySQL" + SEPARATOR
            + "MySQL Server 5.1" + SEPARATOR
            + "bin" + SEPARATOR;
    private static String PRESENTATION =
            "==========================================================\n"
            + "  Backup do banco de dados MySQL - Versao " + VERSION + "\n"
            + "  Autor: Luciano da Silva Martins\n"
            + "  Desenvolvido em 04/08/2013\n"
            + "  Luxu System´s, 2013-2016\n"
            + "==========================================================\n\n";
    // Lista dos bancos de dados a serem "backupeados"; se desejar adicionar mais,
    // basta colocar o nome separado por espaços dos outros nomes
//  private static String DATABASES =
//    "agenda cultos webcheckadmin projectmanager calendario webfinance mysql";
    private static String DATABASES = "boteko";
    private List<String> dbList = new ArrayList<String>();

    public Backup() {
        DateTime cal = new DateTime();
        int dia = cal.getDayOfMonth();
        int mes = cal.getMonthOfYear();
        int ano = cal.getYear();
        int hora = cal.getHourOfDay();
        int min = cal.getMinuteOfHour();
        int seg = cal.getSecondOfMinute();
        String command = MYSQL_PATH + "mysqldump.exe";
        String[] databases = DATABASES.split(" ");
        // Cria diretório
//        File diretorio = new File("D:/SDO-Backup");
        File diretorio = new File("");
        if (!diretorio.isDirectory()) {
//            new File("D:/SDO-Backup").mkdir();
            new File("").mkdir();
        }
        for (int i = 0; i < databases.length; i++) {
            dbList.add(databases[i]);
        }

        // Mostra apresentação
        System.out.println(PRESENTATION);
        System.out.println("Iniciando backups...\n\n");
        // Contador
        int i = 1;
        // Tempo
        long time1, time2, time;
        // Início
        time1 = System.currentTimeMillis();
        for (String dbName : dbList) {
            ProcessBuilder pb = new ProcessBuilder(
                    command,
                    "--user=root",
                    "--password=iu00q71o",
                    dbName,
                    "--result-file=bkp_" + dbName + "_" + dia + "_" 
                            + mes + "_" + ano + "_" + hora + "_" 
                            + min + "_" + seg + ".sql");
            try {
                pb.start();
                // Fim
                time2 = System.currentTimeMillis();
                // Tempo total da operação
                time = time2 - time1;
                // Avisa do sucesso
                System.out.println("\nBackups realizados com sucesso.\n\n");
                JOptionPane.showMessageDialog(null, "Backups realizados com sucesso!");
                System.out.println("Tempo total de processamento: " + time + " ms\n");
                System.out.println("Finalizando...");
                // Paralisa por 2 segundos
                Thread.sleep(2000);
            } catch (IOException | HeadlessException | InterruptedException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            i++;
        }
    }
//Leia mais em: Fazendo Backups do MySQL 
//  em Java http://www.devmedia.com.br/fazendo-backups-do-mysql-em-java/17568#ixzz2apZt3IBV
}
