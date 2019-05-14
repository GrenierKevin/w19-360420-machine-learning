# Data Accuracy
## Introduction to ComputerScience - Section
## Kevin Grenier, Abigail wajszilber

## Distributions of Model Accuracy

## Analysis of different error types

	
		-Each time you run the classification model, you should be getting a different accuracy. Why? (hint: lines 148-150 in DataSet.java)
		
		1) The reason for this is the collections.shuffle(fulldataset) which shuffles emlements in a list and randomly assigns them new positions. 
		Therefore when taking 30% of the test set we are getting randomly assigned data values each time the loop goes through an itteration which is cause by the randomness in GetTestSet and GetTraningSet.
		in other words the test set is being cut randomly each time thus making us work with different values each loop. 
			
		-What is a sensible baseline against which we should compare our model's performance? (hint: line 200 in DataSet.java)
		
		2) A sensible base line would be the method that indicates the frequency of certain labels. 
		Using this frequency we could find out how much of our data is actually benign since we assumed everyone is benign at the start of the test.
		
		-what is a
		-False Positive?
		-False Negative?
		1) A false positive is when you recive a positive result for a test when the result should have been negative. A false negavtive is when you receive a negative result when yous hould have recived a positive result. 
			For example in relation to the medical field a false-positive test result indicates that a person has a specific disease or condition when the person actually does not have it.
		
		-Extend your analysis in the previous step (with the 1000 runs) to keep track of Recall and Precision as well
		What makes these two measures different?
		What are sensible baseline for each of these measures?
		
		1) Precision is a measurment of exactness ie it keeps track of the positive predictions that are correct ie how many selected itmes are relevant.
		2) Recall is a measurment of completeness over quantity ie recall is the postive test results that are correctly identified ie how many relevant items are selected.
		3)The baseline for precision is 1 the closer you get to one the more precise it is. The baseline for recall would also be 1 and as for precision the closer you get to one the more accurate you are.
		
		How do the above results change with the hyperparameter k?
		1)Since the hyperparameter k is used to find the k nearest neighbors.
		So the larger your k value the harder it is to find the nearest class since the computer has to look through multiple different neighbors before making a label prediction. 
		Another important factor with the hyperparameter k is that it should not be a even number in order to avoid ties for the nearest neighbor.
		