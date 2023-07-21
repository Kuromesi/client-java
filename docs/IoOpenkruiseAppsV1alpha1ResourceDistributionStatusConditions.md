
# IoKruiseAppsV1alpha1ResourceDistributionStatusConditions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failedNamespace** | **List&lt;String&gt;** | FailedNamespaces describe all failed namespaces when Status is False |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | LastTransitionTime is the last time the condition transitioned from one status to another. |  [optional]
**reason** | **String** | Reason describe human readable message indicating details about last transition. |  [optional]
**status** | **String** | Status of the condition, one of True, False, Unknown. | 
**type** | **String** | Type of ResourceDistributionCondition. | 



