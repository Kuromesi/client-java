
# IoKruiseAppsV1alpha1ResourceDistributionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;IoKruiseAppsV1alpha1ResourceDistributionStatusConditions&gt;**](IoKruiseAppsV1alpha1ResourceDistributionStatusConditions.md) | Conditions describe the condition when Resource creating, updating and deleting. |  [optional]
**desired** | **Integer** | Desired represents the number of total target namespaces. |  [optional]
**failed** | **Integer** | Failed represents the number of failed distributions. |  [optional]
**observedGeneration** | **Long** | ObservedGeneration represents the .metadata.generation that the condition was set based upon. |  [optional]
**succeeded** | **Integer** | Succeeded represents the number of successful distributions. |  [optional]



