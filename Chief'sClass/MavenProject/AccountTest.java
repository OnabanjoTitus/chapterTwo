import org.junit.jupiter.api.Test;
import org.junit.runner.Result;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Accounts accounts;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Account steve= new Account(111,"steve","k",2000);
        Account john= new Account(112,"john","snow",200);
        Account white= new Account(113,"white","tye",2300);
        Account brown= new Account(114,"brown","sly",2100);
        accounts= new Accounts();
        accounts.getAccounts().add(steve);
        accounts.getAccounts().add(john);
        accounts.getAccounts().add(white);
        accounts.getAccounts().add(brown);


    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void createXmlFile(){
        String filename="C:\\Files\\Titusy.xml";
        Path newPath = Paths.get(filename);
        try(BufferedWriter output = Files.newBufferedWriter(newPath)){
            JAXB.marshal(accounts,output);
            assertNotNull(filename);
            assertTrue(Files.exists(newPath));



        }catch (IOException ioException){
            System.err.println();
        }
    }
    @Test
    void ReadXmlFile(){
        String filename="C:\\Files\\Titusy.xml";
        Path newPath = Paths.get(filename);
        try(BufferedReader input = Files.newBufferedReader(newPath)){

//            BufferedReader reader = new BufferedReader(
//                    new InputStreamReader(newInputStream));
//            String line = null;
//            while ((line = reader.readLine(  )) != null) {
//                System.out.println(line);
//            JAXB.unmarshal(filename);
            assertNotNull(filename);
            assertTrue(Files.exists(newPath));


            File file = new File(filename);
            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(Accounts.class);
            //creating the unmarshall object
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            //calling the unmarshall method
           Accounts accounts=(Accounts) unmarshallerObj.unmarshal(file);
            assertNotNull(accounts);
        }catch (IOException | JAXBException ioException){
            System.err.println();
        }
    }
}