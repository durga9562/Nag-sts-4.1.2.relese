package com.ojas.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductExportService {
	@Scheduled(cron="0 0 9 * * *")
public void exportData() {
	System.out.println("done");
}
}
