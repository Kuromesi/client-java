
# IoKruiseAppsV1alpha1SidecarSetSpecInjectionStrategyRevision

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customVersion** | **String** | CustomVersion corresponds to label &#39;apps.kruise.io/sidecarset-custom-version&#39; of (History) SidecarSet. SidecarSet will select the specific ControllerRevision via this CustomVersion, and then restore the history SidecarSet to inject specific version of the sidecar to pods. |  [optional]
**policy** | **String** | Policy describes the behavior of revision injection. Defaults to Always. |  [optional]
**revisionName** | **String** | RevisionName corresponds to a specific ControllerRevision name of SidecarSet that you want to inject to Pods. |  [optional]



