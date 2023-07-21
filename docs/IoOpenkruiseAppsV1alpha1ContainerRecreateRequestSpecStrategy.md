
# IoKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failurePolicy** | **String** | FailurePolicy decides whether to continue if one container fails to recreate |  [optional]
**forceRecreate** | **Boolean** | ForceRecreate indicates whether to force kill the container even if the previous container is starting. |  [optional]
**minStartedSeconds** | **Integer** | Minimum number of seconds for which a newly created container should be started and ready without any of its container crashing, for it to be considered Succeeded. Defaults to 0 (container will be considered Succeeded as soon as it is started and ready) |  [optional]
**orderedRecreate** | **Boolean** | OrderedRecreate indicates whether to recreate the next container only if the previous one has recreated completely. |  [optional]
**terminationGracePeriodSeconds** | **Long** | TerminationGracePeriodSeconds is the optional duration in seconds to wait the container terminating gracefully. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, we will use pod.Spec.TerminationGracePeriodSeconds as default value. |  [optional]
**unreadyGracePeriodSeconds** | **Long** | UnreadyGracePeriodSeconds is the optional duration in seconds to mark Pod as not ready over this duration before executing preStop hook and stopping the container. |  [optional]



