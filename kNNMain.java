import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;



public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{
	for(int j = 0; j<1000;j++)
	{
	// TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label

		DataSet iris = new DataSet();
		
		List<DataPoint> irisList = DataSet.readDataSet(args[0]);
		DataPoint irisP = irisList.get(120);
		double[] values = irisP.getX();
		String irisFlower = irisP.getLabel();
		
		System.out.println(irisFlower);
		
		for(int i=0; i<values.length; i++)
		{
			System.out.println(values[i]);
		}

    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
		List<DataPoint> test = DataSet.getTestSet(irisList,0.3);
		List<DataPoint> training = DataSet.getTrainingSet(irisList,0.7);

    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)



    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label
		
		 KNNClassifier pepe = new KNNClassifier(3);
		
		 String prediction = pepe.predict(irisList, irisP);
		 System.out.println(prediction);


    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.
			double[] arr = new double[1000];
			double n = 0;
			double percentage;
			double m = 0;
		//for(int j = 0; j<1000;j++)
		//{	
			for(int i =0; i<test.size(); i++)
			{
				String predictedlabel = pepe.predict(training, test.get(i));
				if (predictedlabel.equals(test.get(i).getLabel()))
				{
					n++;
				}
					m++;
			}
	
		percentage = (n/m)*100;
		System.out.println("the number is equal to" +n);
		System.out.println("the percentage is" +percentage);
		arr[j] = percentage;
		//}
		mean(arr);
		//System.out.println("Sum is "+sum);
		standardDeviation(arr);
		//System.out.println("Stand is "+sum);
	}
  }
  

  public static double mean(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: average of the elements of array, as a double
    */
    double sum = 0.0;

    for (int k =0; k<arr.length; k++){
      sum += arr[k];
    }
    sum = sum/arr.length;
	System.out.println("Sum is "+sum);
	return sum;
	
  }

  public static double standardDeviation(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: standard deviation of the elements of array, as a double
    Dependencies: requires the *mean* method written above
    */
    double avg = mean(arr);
    double sum = 0.0;
    for (double a : arr){
      sum += Math.pow(a-avg,2);
    }
	sum = sum/arr.length;
	System.out.println("Stand is "+sum);
	return sum;
	
  }

}
