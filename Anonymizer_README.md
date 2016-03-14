#Description
Data to be used in the context of the MIP needs to be anonymized twice: first when exported from the hospital systems and second when queried.
Data is first anonymized when exported from hospital information systems before it is integrated into the MIP. On the export from the hospital systems all personal identifiers are stripped from it, i.e., identifiers (like name, social security numbers etc.) that allow to directly infer the identity of the patient are removed. Once this is accomplished, the MIP integrates the data and can answer queries on it.
Any personal identifiers also need to be stripped from query results before they are returned to the platform (and therewith before sending the results back to the user).
The data to be anonymized is multi-modal, i.e., encompasses MRI data (based on the DICOM1 standard), potentially PET, full text (patient files, notes etc.), genetic, proteomic etc.
Anonymization of the data is to be verifiable, i.e., after anonymization the data needs to be tested to ensure that there are no personal identifiers left.

#Functionality
The goal of the anonymizer module deployed at a hospital is to:
   * strip all data exported from the hospital’s systems from personal identifiers and 
   * control that incoming queries conform to privacy standards, i.e., the columns they read are limited and (c) strip all query results from personal identifiers as well.

More precisely, identifiers are initially removed when exporting data from hospital information systems, i.e., even before the data is accessed by the medical informatics platform for the first time. In this process all personal identifiers are stripped from the data. Second, to ensure no personal information leaves the hospitals, incoming queries are checked to ensure they only request fields made available to the federated platform. Finally, to further reduce the information available about individual patients, the platform filters all results (ensuring they do not contain any personal patient information) before returning them to the users of the platform. The three components have the following functionality.
##Anonymization on Export from Hospital Systems
First, data is anonymized when exporting it from hospital systems:
    
1. Patient data stored in systems like Molis, Soarian, PACS from vendors such as Siemens 
is exported by selecting all fields and attributes that do not contain unique identifiers (e.g., names etc.). 
All free text in the patient data is searched for the unique identifiers to redact them. 
1. Metadata (DICOM headers): anonymization of the metadata primarily focuses on removing identifiers from DICOM headers. The following two procedures are used combined: 
  1. A software component removes all DICOM header fields containing patient identifiers. The bidder maintains (and updates) a blacklist of all fields suspected to contain identifiers.
  1. Identifiers (e.g., name) of the patient are used in a fulltext search of the header fields, redacting or replacing all identifiers. Risk of misspelled identifiers (names etc.) is mitigated by using an approximate fulltext search. 
1. Genetic data as well as lab results (blood tests, etc.) are anonymized by removing personal identifiers as well.
The process of stripping personal information from DICOM images is performed repeatedly. First all images produced to date will be stripped in one go before the launch of the medical informatics platform. Subsequently, the anonymization process is repeated on a regular basis (i.e., every three months) where only the new images need to be processes. 

##Filtering coming queries
The medical informatics platform operators define what type of queries can be executed (what complexity they have, what columns they can retrieve, whether only aggregate values can be retrieved or not, etc.). Incoming queries are therefore filtered based on a list of permitted query templates that are allowed to be executed at the local database. If queries arrive that are no allowed to be executed, an error message is returned to the requester and a report is logged on disk. As mentioned previously, permitted queries (generic templates) are listed in a file. 

##Anonymization on returning results to users
The results of each query are also anonymized before they leave the local hospital on their way to the platform user. Whenever a query is asked, the result is whitewashed before being returned. More particularly, specified columns are scanned for personal information, i.e., dates, names etc., and all personal information identified will be removed. At the launch of the platform, the columns that need to be scanned (tens of columns) as well as the keywords (tens to few hundreds) that need to be replaced are specified. To ensure also misspelled keywords are captured, an approximate search needs to be used. 

##Technologies used
The anonymization module requires the following:
   * a Java 7 JRE/JDK (or greater) is required to run the Anonymizers. 
   * a valid license 
 The language for the configuration files is YAML (“YAML Ain’t Markup Language). 
YAML is a human readable data serialization language. Due to the YAML Parser used, some syntax constraints have to be respected:
   * Indent using the space character (always use the same number of space characters) 
   * Do not indent using the tabulation character 

