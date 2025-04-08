const base = {
    get() {
        return {
            url : "http://localhost:8080/ssml5p10/",
            name: "ssml5p10",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssml5p10/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "老年公寓管理系统"
        } 
    }
}
export default base
