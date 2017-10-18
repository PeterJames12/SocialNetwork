package monitoring.controller;

import monitoring.exception.BadSiteException;
import monitoring.service.MonitoringService;
import monitoring.service.impl.MonitoringServiceImpl;

import java.util.Scanner;

/**
 * @author Igor Hnes on 10/18/17.
 */
public class MonitoringController {

    public static void main(String[] args) {

        MonitoringService monitoringService = new MonitoringServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your site");
        final String site = scanner.nextLine();

        if (monitoringService.check(site)) {
            monitoringService.save(site);
        }

        scanner.close();
    }
}
