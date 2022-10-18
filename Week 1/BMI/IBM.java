import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class IBM{

    private float weight;
    private float height;

    public IBM(Float height, Float weight){
      this.height = height;
      this.weight = weight;
    } 


    public void BMI(){
      
     float bmi = (100*100*weight) / (height*height);
      
     System.out.println(bmi);
    }

    
}