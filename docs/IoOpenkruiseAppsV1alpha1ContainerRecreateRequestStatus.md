
# IoKruiseAppsV1alpha1ContainerRecreateRequestStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the ContainerRecreateRequest was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**containerRecreateStates** | [**List&lt;IoKruiseAppsV1alpha1ContainerRecreateRequestStatusContainerRecreateStates&gt;**](IoKruiseAppsV1alpha1ContainerRecreateRequestStatusContainerRecreateStates.md) | ContainerRecreateStates contains the recreation states of the containers. |  [optional]
**message** | **String** | A human readable message indicating details about this ContainerRecreateRequest. |  [optional]
**phase** | **String** | Phase of this ContainerRecreateRequest, e.g. Pending, Recreating, Completed | 



