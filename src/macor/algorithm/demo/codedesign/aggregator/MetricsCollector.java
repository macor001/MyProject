package macor.algorithm.demo.codedesign.aggregator;

public class MetricsCollector {
    private MetricsStorage metricsStorage;

    /**
     * 依赖注入
     * @param metricsStorage
     */
    public MetricsCollector(MetricsStorage metricsStorage){
        this.metricsStorage = metricsStorage;
    }

    /**
     * 用一个函数代替了最小原型中的两个函数
     * @param requestInfo
     */
    public void recordRequest(RequestInfo requestInfo){
        if(requestInfo == null || null != requestInfo.getApiName()){
            return;
        }

        metricsStorage.saveRequestInfo(requestInfo);
    }
}
