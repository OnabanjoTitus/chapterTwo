import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WimpsArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void test(){
        int [] scores= {1,2,3,4};
        int [] testScores= new int[4];
        int [] scoringTest=testScores ;
        testScores[0]=1;
        testScores[1]=2;
        testScores[2]=3;
        testScores[3]=4;
        String[] names={"Ibukun","Onyi","Akokite"};
        System.out.println("Implementing for loop......");
        for(int i=0;i< names.length;i++){
            System.out.println("Name at index " +i+ " is " +names[i]);
        }
        System.out.println();
        System.out.println("Implementing while loop......");
        int counter=0;
        while(counter<names.length){
            System.out.println("Name at index " +counter+ " is " +names[counter]);
            counter++;
        }
        System.out.println();
        System.out.println("Implementing do-while loop......");
        int counting=0;
        do{
            System.out.println("Name at index " +counting+ " is " +names[counting]);
            counting++;
        }while (counting< names.length);

    }
    @Test
    void multiDimensionalArray(){
        int[][] grades= new int [3][4];
        int [][]scores={
                {70,89,98,93},
                {57,49,82,90},
                {75,34,99,45}
        };
        scores[0][1]=95;
        for(int row=0;row<scores.length;row++){
            System.out.println("Processing row " +row);
            for(int column=0;column<scores[0].length;column++){
                System.out.print(scores[row][column]);
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println();
        for(int []row: scores){
            System.out.println("Processing a row");
            for(int column: row){
                System.out.print(column);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    @Test
    void nativeTest(){

     Native wimps= new Native();
     wimps.setStudentId("SCV5025");
     wimps.setFirstName("Titus");
     wimps.setSurname("Onabanjo");
     wimps.setDatabaseGrade(2);
     wimps.setCriticalThinking(4);
     wimps.setJavaGrade(7);

     Native wimps1= new Native("1234","Tyga","Tee");
     wimps.setDatabaseGrade(1);
     wimps.setCriticalThinking(2);
     wimps.setJavaGrade(3);

     int [] wimpScores={75,90,78};
     Native wimps3= new Native("1234","TTT","TiTi", wimpScores);
     assertEquals(75,wimps3.getJavaGrade());

    }
    @Test
    void testExercise(){
        float total=0;
        float [] c= new float[100];
        for(int i=0;i<c.length;i++){
            c[i]=i;
            total=total+c[i];
        }
        assertEquals(4950,total);
    }
    @Test
    void testArrayMore(){
        int [][]t= new int[2][3];
    }

}