
# IoKruiseAppsV1alpha1SidecarSetSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containers** | **List&lt;Object&gt;** | Containers is the list of sidecar containers to be injected into the selected pod |  [optional]
**imagePullSecrets** | [**List&lt;IoKruiseAppsV1alpha1SidecarSetSpecImagePullSecrets&gt;**](IoKruiseAppsV1alpha1SidecarSetSpecImagePullSecrets.md) | List of the names of secrets required by pulling sidecar container images |  [optional]
**initContainers** | **List&lt;Object&gt;** | InitContainers is the list of init containers to be injected into the selected pod We will inject those containers by their name in ascending order We only inject init containers when a new pod is created, it does not apply to any existing pod |  [optional]
**injectionStrategy** | [**IoKruiseAppsV1alpha1SidecarSetSpecInjectionStrategy**](IoKruiseAppsV1alpha1SidecarSetSpecInjectionStrategy.md) |  |  [optional]
**namespace** | **String** | Namespace sidecarSet will only match the pods in the namespace otherwise, match pods in all namespaces(in cluster) |  [optional]
**namespaceSelector** | [**IoKruiseAppsV1alpha1SidecarSetSpecNamespaceSelector**](IoKruiseAppsV1alpha1SidecarSetSpecNamespaceSelector.md) |  |  [optional]
**patchPodMetadata** | [**List&lt;IoKruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata&gt;**](IoKruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata.md) | SidecarSet support to inject &amp; in-place update metadata in pod. |  [optional]
**revisionHistoryLimit** | **Integer** | RevisionHistoryLimit indicates the maximum quantity of stored revisions about the SidecarSet. default value is 10 |  [optional]
**selector** | [**IoKruiseAppsV1alpha1SidecarSetSpecSelector**](IoKruiseAppsV1alpha1SidecarSetSpecSelector.md) |  |  [optional]
**updateStrategy** | [**IoKruiseAppsV1alpha1SidecarSetSpecUpdateStrategy**](IoKruiseAppsV1alpha1SidecarSetSpecUpdateStrategy.md) |  |  [optional]
**volumes** | **Object** | List of volumes that can be mounted by sidecar containers |  [optional]



