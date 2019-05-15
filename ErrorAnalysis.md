# Data Accuracy
## Introduction to ComputerScience - Section
## Kevin Grenier, Abigail wajszilber

## Distributions of Model Accuracy

## Analysis of different error types

	
		-Each time you run the classification model, you should be getting a different accuracy. Why? (hint: lines 148-150 in DataSet.java)
		-Run the entire classification process 1000 times (load data, split into off 30% for a test set, evaluate model performance)
		store the results of each run in a double[]; use the mean and standardDeviation methods in kNNMain.java to calculate how much performance can be expected to vary on unseen data
		
		1) The reason for this is the collections.shuffle(fulldataset) which shuffles emlements in a list and randomly assigns them new positions. 
		Therefore when taking 30% of the test set we are getting randomly assigned data values each time the loop goes through an itteration which is cause by the randomness in GetTestSet and GetTraningSet.
		in other words the test set is being cut randomly each time thus making us work with different values each loop. Our model accuracy came out to be 96.54% with a standard deviation of 1.14.
			
		-What is a sensible baseline against which we should compare our model's performance? (hint: line 200 in DataSet.java)
		
		2) A sensible base line would be 65% since we assumed that everything started as bening and the actually data distribution is 65% bening and 35% malignant therefore the sensible baseline would be 65%.
		
		-what is a
		-False Positive?
		-False Negative?
		1) A false positive is when you recive a positive result for a test when the result should have been negative.
			For example in relation to the medical field a a false-positive test result indicates that a person has a specific disease or condition when the person actually does not have it.
		
		2)A false negavtive is when you receive a negative result when yous hould have recived a positive result. 
			For example in relation to the medical field a false-negative test result indicates that a person does not have  a specific disease or condition when the person actually does have it.
		
		-Extend your analysis in the previous step (with the 1000 runs) to keep track of Recall and Precision as well
		What makes these two measures different?
		What are sensible baseline for each of these measures?
		
		1) Precision is a measurment of exactness ie it keeps track of the positive predictions that are correct ie how many selected itmes are relevant.
		2) Recall is a measurment of completeness over quantity ie recall is the postive test results that are correctly identified ie how many relevant items are selected.
		3)The reasoning behind the values being different is because they are both being divised by different values ie precision is defined by true positives over predicted postivies while recall is defined as true postivies over actual positives.
		4)A sensible baseline for these measurments would be to try and maximize the recall so looking at the equations a way to maximize the recall value would be to assume every tumor is malignant which would make the precision value be 35% and the recall be 100% while assuming all tumors to be benign makes both of the values zero which is not good.
		
		How do the above results change with the hyperparameter k?
		1)Since the hyperparameter k is used to find the k nearest neighbors.
		So the larger your k value the harder it is to find the nearest class since the computer has to look through multiple different neighbors before making a label prediction. ie the recall value decreases and the presision goes up which is not what we want.
		Another important factor with the hyperparameter k is that it should not be a even number in order to avoid ties for the nearest neighbor.
		