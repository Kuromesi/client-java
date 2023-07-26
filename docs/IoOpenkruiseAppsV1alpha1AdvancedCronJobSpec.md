
# IoKruiseAppsV1alpha1AdvancedCronJobSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**concurrencyPolicy** | [**ConcurrencyPolicyEnum**](#ConcurrencyPolicyEnum) | Specifies how to treat concurrent executions of a Job. Valid values are: - \&quot;Allow\&quot; (default): allows CronJobs to run concurrently; - \&quot;Forbid\&quot;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - \&quot;Replace\&quot;: cancels currently running job and replaces it with a new one |  [optional]
**failedJobsHistoryLimit** | **Integer** | The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. |  [optional]
**paused** | **Boolean** | Paused will pause the cron job. |  [optional]
**schedule** | **String** | The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron. | 
**startingDeadlineSeconds** | **Long** | Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones. |  [optional]
**successfulJobsHistoryLimit** | **Integer** | The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. |  [optional]
**template** | [**IoKruiseAppsV1alpha1AdvancedCronJobSpecTemplate**](IoKruiseAppsV1alpha1AdvancedCronJobSpecTemplate.md) |  | 
**timeZone** | **String** | The time zone name for the given schedule, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If not specified, this will default to the time zone of the kruise-controller-manager process. |  [optional]


<a name="ConcurrencyPolicyEnum"></a>
## Enum: ConcurrencyPolicyEnum
Name | Value
---- | -----
ALLOW | &quot;Allow&quot;
FORBID | &quot;Forbid&quot;
REPLACE | &quot;Replace&quot;



