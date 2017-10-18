package monitoring.dao.impl;

import monitoring.dao.MonitoringDao;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 10/18/17.
 */
public class MonitoringDaoImpl implements MonitoringDao {

    private static final String PATH_GOOD_SITES = "src/main/java/monitoring/storage/confiansa_sites.txt";
    private static final String PATH_BAD_SITES = "src/main/java/monitoring/storage/mal_sites.txt";

    public static void main(String[] args) {

        new MonitoringDaoImpl().getGoodSite();

    }
    /**
     * {@inheritDoc}.
     */
    @Override
    public List<String> getGoodSite() {
        List<String> list = new LinkedList<>();
        File file = new File(PATH_GOOD_SITES);
        try (final BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String data;
            while ((data = reader.readLine()) != null) {
                list.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<String> getBadSite() {
        List<String> list = new LinkedList<>();
        File file = new File(PATH_BAD_SITES);
        try (final BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String data;
            while ((data = reader.readLine()) != null) {
                list.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void save(String site) {
        File file = new File(PATH_GOOD_SITES);
        try (final BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("\n");
            writer.write(site);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
