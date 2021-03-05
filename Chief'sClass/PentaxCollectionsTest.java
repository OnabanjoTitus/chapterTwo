package com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PentaxCollectionsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void autoBoxing(){
        int theAge=15;
        Integer age=theAge;

        Double theBalance=Double.valueOf(25.3);
        double balance=theBalance;
    }
    @Test
    void pentaxList(){
        List <String> pentax= new ArrayList<>();
        pentax.add("sunkanmi");
        pentax.add("Lasuite");
        pentax.add("Onyi");
        Iterator<String> names=pentax.iterator();
        while(names.hasNext()){
            System.out.println(names.next());
        }
        assertTrue(pentax.size()==3);
        pentax.remove("Lasuite");
        assertTrue(pentax.size()==2);
        assertTrue(pentax.contains("sunkanmi"));
        String missAgbo = pentax.get(1);
        assertTrue(missAgbo.equals("Onyi"));
        pentax.clear();
        assertTrue(pentax.isEmpty());

        List<Integer> testCoverage= new Vector<>();
        testCoverage.add(0);
        testCoverage.add(10);
        testCoverage.add(2);

        int barnabasTestCoverage=testCoverage.get(1);
        assertTrue(barnabasTestCoverage==10);

    }
    @Test
    void testCollections(){
        String[]colors={"MAGENTA","RED","WHITE","BLUE","CYAN"};
        List<String>list=new ArrayList<>();
        for(String color:colors){
            list.add(color);
        }
        String[]removeColors={"RED","WHITE","BLUE"};
        List<String>removeList= new ArrayList<>();
        for(String color:removeColors){
            removeList.add(color);
        }
        System.out.println("ArrayList: ");
        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ",list.get(count));
        }
        System.out.println("\nRemoveList: ");
        for (int count = 0; count < removeList.size(); count++) {
            System.out.printf("%s ",removeList.get(count));
        }

        for(String color:removeList){
            list.remove(color);
        }
        System.out.println("\nArrayList after removal: ");
        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ",list.get(count));
        }

    }
    @Test
    void pentaxSet(){
        Set<String> lasuites=new TreeSet<>();
        lasuites.add("Mr. 10%");
        lasuites.add("Dimeji");
        lasuites.add("Chijioke");
        assertTrue(lasuites.size()==3);
        lasuites.add("Chijioke");
        assertTrue(lasuites.size()==3);
        lasuites.remove("Mr. 10%");
        assertTrue(lasuites.size()==2);


        Iterator<String>wimps=lasuites.iterator();
        while (wimps.hasNext()){
            System.out.println(wimps.next());
        }
        Set<Integer>testCoverage=new TreeSet<>();
        testCoverage.add(10);

    }
    @Test
    void pentaxMap(){
        Map<String,String> pentaxWimps= new HashMap<>();
        pentaxWimps.put("SCV5001","Dami");
        pentaxWimps.put("SCV5010","Kenny");
        pentaxWimps.put("SCV5020","Peter");
        pentaxWimps.put("SCV5001","Badmus");
        pentaxWimps.put("SCV5012","Sunkanmi");
        pentaxWimps.put("SK","Sunkanmi");

       assertTrue(pentaxWimps.containsKey("SK"));
       assertFalse(pentaxWimps.isEmpty());



        Set<String>pentaxIds=pentaxWimps.keySet();
        assertTrue(pentaxIds.size()==5);
        Iterator<String>keys=pentaxIds.iterator();
        while (keys.hasNext()){
            String key=keys.next();
            String value=pentaxWimps.get(key);
            System.out.println(key+ " Is mapped to " +value);
        }

        Collection<String>values=pentaxWimps.values();
        for(String value:values){
            System.out.println(value);
        }
        pentaxWimps.clear();
        assertTrue(pentaxWimps.isEmpty());
        String[]idArray=pentaxWimps.values().toArray(new String[0]);

        Set<String> ids=Set.of(idArray);
        List<String> idList=List.of(idArray);
    }
}