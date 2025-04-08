
var projectName = '老年公寓管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '公寓信息',
	url: './pages/gongyuxinxi/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssml5p10/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除","添加联络人"],"menu":"老人","menuJump":"列表","tableName":"laoren"}],"menu":"老人管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"联络人","menuJump":"列表","tableName":"lianluoren"}],"menu":"联络人管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公寓信息","menuJump":"列表","tableName":"gongyuxinxi"}],"menu":"公寓信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房间信息","menuJump":"列表","tableName":"fangjianxinxi"}],"menu":"房间信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"住宿信息","menuJump":"列表","tableName":"zhusuxinxi"}],"menu":"住宿信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"缴费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"缴费信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"健康信息","menuJump":"列表","tableName":"jiankangxinxi"}],"menu":"健康信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"请假信息","menuJump":"列表","tableName":"qingjiaxinxi"}],"menu":"请假信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"退住信息","menuJump":"列表","tableName":"tuizhuxinxi"}],"menu":"退住信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"访客记录","menuJump":"列表","tableName":"fangkejilu"}],"menu":"访客记录管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公寓信息列表","menuJump":"列表","tableName":"gongyuxinxi"}],"menu":"公寓信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"老人","menuJump":"列表","tableName":"laoren"}],"menu":"老人管理"},{"child":[{"buttons":["查看","房间安排"],"menu":"房间信息","menuJump":"列表","tableName":"fangjianxinxi"}],"menu":"房间信息管理"},{"child":[{"buttons":["查看","修改","添加健康信息","访客来访"],"menu":"住宿信息","menuJump":"列表","tableName":"zhusuxinxi"}],"menu":"住宿信息管理"},{"child":[{"buttons":["新增","查看","修改"],"menu":"缴费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"缴费信息管理"},{"child":[{"buttons":["查看","修改"],"menu":"健康信息","menuJump":"列表","tableName":"jiankangxinxi"}],"menu":"健康信息管理"},{"child":[{"buttons":["查看"],"menu":"请假信息","menuJump":"列表","tableName":"qingjiaxinxi"}],"menu":"请假信息管理"},{"child":[{"buttons":["查看"],"menu":"退住信息","menuJump":"列表","tableName":"tuizhuxinxi"}],"menu":"退住信息管理"},{"child":[{"buttons":["查看","修改"],"menu":"访客记录","menuJump":"列表","tableName":"fangkejilu"}],"menu":"访客记录管理"},{"child":[{"buttons":["查看"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公寓信息列表","menuJump":"列表","tableName":"gongyuxinxi"}],"menu":"公寓信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"员工","tableName":"yuangong"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"联络人","menuJump":"列表","tableName":"lianluoren"}],"menu":"联络人管理"},{"child":[{"buttons":["查看","退住","请假"],"menu":"住宿信息","menuJump":"列表","tableName":"zhusuxinxi"}],"menu":"住宿信息管理"},{"child":[{"buttons":["查看","支付"],"menu":"缴费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"缴费信息管理"},{"child":[{"buttons":["查看"],"menu":"健康信息","menuJump":"列表","tableName":"jiankangxinxi"}],"menu":"健康信息管理"},{"child":[{"buttons":["查看","修改"],"menu":"请假信息","menuJump":"列表","tableName":"qingjiaxinxi"}],"menu":"请假信息管理"},{"child":[{"buttons":["查看"],"menu":"退住信息","menuJump":"列表","tableName":"tuizhuxinxi"}],"menu":"退住信息管理"},{"child":[{"buttons":["查看"],"menu":"访客记录","menuJump":"列表","tableName":"fangkejilu"}],"menu":"访客记录管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公寓信息列表","menuJump":"列表","tableName":"gongyuxinxi"}],"menu":"公寓信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"老人","tableName":"laoren"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
