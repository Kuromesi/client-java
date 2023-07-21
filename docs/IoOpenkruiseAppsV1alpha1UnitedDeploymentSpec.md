
# IoKruiseAppsV1alpha1UnitedDeploymentSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replicas** | **Integer** | Replicas is the total desired replicas of all the subsets. If unspecified, defaults to 1. |  [optional]
**revisionHistoryLimit** | **Integer** | Indicates the number of histories to be conserved. If unspecified, defaults to 10. |  [optional]
**selector** | [**IoKruiseAppsV1alpha1UnitedDeploymentSpecSelector**](IoKruiseAppsV1alpha1UnitedDeploymentSpecSelector.md) |  | 
**template** | [**IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplate**](IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplate.md) |  |  [optional]
**topology** | [**IoKruiseAppsV1alpha1UnitedDeploymentSpecTopology**](IoKruiseAppsV1alpha1UnitedDeploymentSpecTopology.md) |  |  [optional]
**updateStrategy** | [**IoKruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy**](IoKruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy.md) |  |  [optional]



