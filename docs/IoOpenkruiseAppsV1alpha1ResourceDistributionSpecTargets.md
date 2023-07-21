
# IoKruiseAppsV1alpha1ResourceDistributionSpecTargets

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allNamespaces** | **Boolean** | If AllNamespaces is true, Resource will be distributed to the all namespaces (except some forbidden namespaces, such as \&quot;kube-system\&quot; and \&quot;kube-public\&quot;). |  [optional]
**excludedNamespaces** | [**IoKruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespaces**](IoKruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespaces.md) |  |  [optional]
**includedNamespaces** | [**IoKruiseAppsV1alpha1ResourceDistributionSpecTargetsIncludedNamespaces**](IoKruiseAppsV1alpha1ResourceDistributionSpecTargetsIncludedNamespaces.md) |  |  [optional]
**namespaceLabelSelector** | [**IoKruiseAppsV1alpha1ResourceDistributionSpecTargetsNamespaceLabelSelector**](IoKruiseAppsV1alpha1ResourceDistributionSpecTargetsNamespaceLabelSelector.md) |  |  [optional]



