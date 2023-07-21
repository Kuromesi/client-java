
# IoKruiseAppsV1alpha1UnitedDeploymentSpecTopologySubsets

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Indicates subset name as a DNS_LABEL, which will be used to generate subset workload name prefix in the format &#39;&lt;deployment-name&gt;-&lt;subset-name&gt;-&#39;. Name should be unique between all of the subsets under one UnitedDeployment. | 
**nodeSelectorTerm** | [**IoKruiseAppsV1alpha1UnitedDeploymentSpecTopologyNodeSelectorTerm**](IoKruiseAppsV1alpha1UnitedDeploymentSpecTopologyNodeSelectorTerm.md) |  |  [optional]
**patch** | **Object** | Patch indicates patching to the templateSpec. Patch takes precedence over other fields If the Patch also modifies the Replicas, NodeSelectorTerm or Tolerations, use value in the Patch |  [optional]
**replicas** | **Object** | Indicates the number of the pod to be created under this subset. Replicas could also be percentage like &#39;10%&#39;, which means 10% of UnitedDeployment replicas of pods will be distributed under this subset. If nil, the number of replicas in this subset is determined by controller. Controller will try to keep all the subsets with nil replicas have average pods. |  [optional]
**tolerations** | [**List&lt;IoKruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations&gt;**](IoKruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations.md) | Indicates the tolerations the pods under this subset have. A subset&#39;s tolerations is not allowed to be updated. |  [optional]



