
# IoKruiseAppsV1alpha1WorkloadSpreadSpecScheduleStrategyAdaptive

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disableSimulationSchedule** | **Boolean** | DisableSimulationSchedule indicates whether to disable the feature of simulation schedule. Default is false. Webhook can take a simple general predicates to check whether Pod can be scheduled into this subset, but it just considers the Node resource and cannot replace scheduler to do richer predicates practically. |  [optional]
**rescheduleCriticalSeconds** | **Integer** | RescheduleCriticalSeconds indicates how long controller will reschedule a schedule failed Pod to the subset that has redundant capacity after the subset where the Pod lives. If a Pod was scheduled failed and still in a unschedulabe status over RescheduleCriticalSeconds duration, the controller will reschedule it to a suitable subset. |  [optional]



