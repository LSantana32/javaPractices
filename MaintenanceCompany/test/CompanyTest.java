import MaintenanceCompany.AlarmReview;
import MaintenanceCompany.PaintJob;
import MaintenanceCompany.Service;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CompanyTest {
    Service paint1= new PaintJob("Pepe","Popa",40.0,20.0);
    Service paint2= new PaintJob("Pepa","Pope",60.0,30.0);
    Service alarm1= new AlarmReview("Pepe","Popa",6);
    Company company= new Company();

    @Test
    public void testCompany(){
        company.hire(paint1);//140.564
        company.hire(paint2);//287.769    330.934
        company.hire(alarm1);//80
        double expectedValue= 551.498;
        double actualValue= company.totalCostOfWorks();
        assertEquals(expectedValue, actualValue,0.2);
    }



}