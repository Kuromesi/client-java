
# IoKruiseAppsV1alpha1WorkloadSpreadSpecSubsets

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxReplicas** | **Object** | MaxReplicas indicates the desired max replicas of this subset. |  [optional]
**name** | **String** | Name should be unique between all of the subsets under one WorkloadSpread. | 
**patch** | **Object** | Patch indicates patching podTemplate to the Pod. |  [optional]
**preferredNodeSelectorTerms** | [**List&lt;IoKruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms&gt;**](IoKruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms.md) | Indicates the node preferred selector to form the subset. |  [optional]
**requiredNodeSelectorTerm** | [**IoKruiseAppsV1alpha1WorkloadSpreadSpecRequiredNodeSelectorTerm**](IoKruiseAppsV1alpha1WorkloadSpreadSpecRequiredNodeSelectorTerm.md) |  |  [optional]
**tolerations** | [**List&lt;IoKruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations&gt;**](IoKruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations.md) | Indicates the tolerations the pods under this subset have. |  [optional]



