package shellSort;

/**
 * Created by user1 on 27.09.2016.
 */
public class ShellSort
{
    public static double[] shellSort(double[] array){
        int arrayLength=array.length,step=1;

        while(step<=arrayLength/3)
            step=step*3+1;
        while(step>0){
            int i,j;
            for(i=step;i<arrayLength;i++){
                double value=array[i];
                j=i;
                while((j>step-1) && (array[j-step]>=value)){
                    array[j]=array[j-step];
                    j-=step;
                }
                array[j]=value;
            }
            step=(step-1)/3;
        }
        return array;
    }
}
