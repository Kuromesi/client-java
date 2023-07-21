
# IoKruiseAppsV1alpha1ContainerRecreateRequestSpecContainers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the container that need to recreate. It must be existing in the real pod.Spec.Containers. | 
**ports** | [**List&lt;IoKruiseAppsV1alpha1ContainerRecreateRequestSpecPorts&gt;**](IoKruiseAppsV1alpha1ContainerRecreateRequestSpecPorts.md) | Ports is synced from the real container in Pod spec during this ContainerRecreateRequest creating. Populated by the system. Read-only. |  [optional]
**preStop** | [**IoKruiseAppsV1alpha1ContainerRecreateRequestSpecPreStop**](IoKruiseAppsV1alpha1ContainerRecreateRequestSpecPreStop.md) |  |  [optional]
**statusContext** | [**IoKruiseAppsV1alpha1ContainerRecreateRequestSpecStatusContext**](IoKruiseAppsV1alpha1ContainerRecreateRequestSpecStatusContext.md) |  |  [optional]



