package nt.EmployeeSalarySlipApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(EmployeeConfigure.class);

        SalarySlipService service = ctx.getBean(SalarySlipService.class);
        service.generateSlip();

        ctx.close();
    }
}