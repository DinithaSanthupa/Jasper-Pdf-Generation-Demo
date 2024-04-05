package com.cbc.bank.serviceImpl;

import com.cbc.bank.dao.CustomerRepository;
import com.cbc.bank.model.Customer;
import com.cbc.bank.service.ReportService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {

    static Logger logger = LoggerFactory.getLogger(ReportServiceImpl.class);

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
        String path = "D:\\Dev\\Dev Repo\\JasperReportsDemo\\reports";
        List<Customer> employees = customerRepository.findAll();
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:customers.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Java Techie");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\customers.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\customers.pdf");
        }

        logger.info("expoert Report class called" + "path " + path);
        return "report generated in path : " + path;
    }
}
