<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="公寓编号" prop="gongyubianhao">
          <el-input v-model="ruleForm.gongyubianhao" 
              placeholder="公寓编号" clearable  :readonly="ro.gongyubianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="公寓编号" prop="gongyubianhao">
              <el-input v-model="ruleForm.gongyubianhao" 
                placeholder="公寓编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="公寓名称" prop="gongyumingcheng">
          <el-input v-model="ruleForm.gongyumingcheng" 
              placeholder="公寓名称" clearable  :readonly="ro.gongyumingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="公寓名称" prop="gongyumingcheng">
              <el-input v-model="ruleForm.gongyumingcheng" 
                placeholder="公寓名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="公寓楼号" prop="gongyulouhao">
          <el-input v-model="ruleForm.gongyulouhao" 
              placeholder="公寓楼号" clearable  :readonly="ro.gongyulouhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="公寓楼号" prop="gongyulouhao">
              <el-input v-model="ruleForm.gongyulouhao" 
                placeholder="公寓楼号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="公寓类别" prop="gongyuleibie">
          <el-input v-model="ruleForm.gongyuleibie" 
              placeholder="公寓类别" clearable  :readonly="ro.gongyuleibie"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="公寓类别" prop="gongyuleibie">
              <el-input v-model="ruleForm.gongyuleibie" 
                placeholder="公寓类别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="公寓位置" prop="gongyuweizhi">
          <el-input v-model="ruleForm.gongyuweizhi" 
              placeholder="公寓位置" clearable  :readonly="ro.gongyuweizhi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="公寓位置" prop="gongyuweizhi">
              <el-input v-model="ruleForm.gongyuweizhi" 
                placeholder="公寓位置" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房间楼层" prop="fangjianlouceng">
          <el-input v-model="ruleForm.fangjianlouceng" 
              placeholder="房间楼层" clearable  :readonly="ro.fangjianlouceng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房间楼层" prop="fangjianlouceng">
              <el-input v-model="ruleForm.fangjianlouceng" 
                placeholder="房间楼层" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房间编号" prop="fangjianbianhao">
          <el-input v-model="ruleForm.fangjianbianhao" 
              placeholder="房间编号" clearable  :readonly="ro.fangjianbianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房间编号" prop="fangjianbianhao">
              <el-input v-model="ruleForm.fangjianbianhao" 
                placeholder="房间编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="性别" prop="xingbie">
          <el-input v-model="ruleForm.xingbie" 
              placeholder="性别" clearable  :readonly="ro.xingbie"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="性别" prop="xingbie">
              <el-input v-model="ruleForm.xingbie" 
                placeholder="性别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="老人姓名" prop="laorenxingming">
          <el-input v-model="ruleForm.laorenxingming" 
              placeholder="老人姓名" clearable  :readonly="ro.laorenxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="老人姓名" prop="laorenxingming">
              <el-input v-model="ruleForm.laorenxingming" 
                placeholder="老人姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="老人编号" prop="laorenbianhao">
          <el-input v-model="ruleForm.laorenbianhao" 
              placeholder="老人编号" clearable  :readonly="ro.laorenbianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="老人编号" prop="laorenbianhao">
              <el-input v-model="ruleForm.laorenbianhao" 
                placeholder="老人编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling" 
              placeholder="年龄" clearable  :readonly="ro.nianling"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="年龄" prop="nianling">
              <el-input v-model="ruleForm.nianling" 
                placeholder="年龄" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua" 
              placeholder="联系电话" clearable  :readonly="ro.lianxidianhua"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="联系电话" prop="lianxidianhua">
              <el-input v-model="ruleForm.lianxidianhua" 
                placeholder="联系电话" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="请假日期" prop="qingjiariqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.qingjiariqi" 
                type="date"
                placeholder="请假日期">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.qingjiariqi" label="请假日期" prop="qingjiariqi">
              <el-input v-model="ruleForm.qingjiariqi" 
                placeholder="请假日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="请假天数" prop="qingjiatianshu">
          <el-input v-model="ruleForm.qingjiatianshu" 
              placeholder="请假天数" clearable  :readonly="ro.qingjiatianshu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="请假天数" prop="qingjiatianshu">
              <el-input v-model="ruleForm.qingjiatianshu" 
                placeholder="请假天数" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="房间信息" prop="fangjianxinxi">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="房间信息"
                  v-model="ruleForm.fangjianxinxi" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.fangjianxinxi" label="房间信息" prop="fangjianxinxi">
                    <span>{{ruleForm.fangjianxinxi}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="请假内容" prop="qingjianeirong">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="请假内容"
                  v-model="ruleForm.qingjianeirong" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.qingjianeirong" label="请假内容" prop="qingjianeirong">
                    <span>{{ruleForm.qingjianeirong}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(255, 255, 102, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"rgba(255, 255, 255, 0.25)","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(25, 169, 123, 1)","addEditBoxColor":"rgba(25, 169, 123, 0.11)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(25, 169, 123, 1)","uploadIconFontColor":"rgba(25, 169, 123, 1)","textareaBorderColor":"rgba(25, 169, 123, 1)","btnCancelBgColor":"rgba(255, 255, 102, 1)","selectLableColor":"rgba(25, 169, 123, 1)","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(0, 0, 0, 1)","dateBorderColor":"rgba(25, 169, 123, 1)","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(25, 169, 123, 1)","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"rgba(25, 169, 123, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"rgba(25, 169, 123, 1)","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(25, 169, 123, 1)","inputBorderColor":"rgba(25, 169, 123, 1)","uploadBorderColor":"rgba(25, 169, 123, 1)","textareaFontColor":"rgba(0, 0, 0, 1)","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"rgba(25, 169, 123, 1)","btnSaveBorderColor":"rgba(25, 169, 123, 1)","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	gongyubianhao : false,
	gongyumingcheng : false,
	gongyulouhao : false,
	gongyuleibie : false,
	gongyuweizhi : false,
	fangjianlouceng : false,
	fangjianbianhao : false,
	fangjianxinxi : false,
	xingbie : false,
	laorenxingming : false,
	laorenbianhao : false,
	nianling : false,
	lianxidianhua : false,
	qingjianeirong : false,
	qingjiariqi : false,
	qingjiatianshu : false,
	sfsh : false,
	shhf : false,
      },
      ruleForm: {
        gongyubianhao: '',
        gongyumingcheng: '',
        gongyulouhao: '',
        gongyuleibie: '',
        gongyuweizhi: '',
        fangjianlouceng: '',
        fangjianbianhao: '',
        fangjianxinxi: '',
        xingbie: '',
        laorenxingming: '',
        laorenbianhao: '',
        nianling: '',
        lianxidianhua: '',
        qingjianeirong: '',
        qingjiariqi: '',
        qingjiatianshu: '',
        shhf: '',
      },
      rules: {
          gongyubianhao: [
          ],
          gongyumingcheng: [
          ],
          gongyulouhao: [
          ],
          gongyuleibie: [
          ],
          gongyuweizhi: [
          ],
          fangjianlouceng: [
          ],
          fangjianbianhao: [
          ],
          fangjianxinxi: [
          ],
          xingbie: [
          ],
          laorenxingming: [
          ],
          laorenbianhao: [
          ],
          nianling: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          lianxidianhua: [
                { validator: validateMobile, trigger: 'blur' },
          ],
          qingjianeirong: [
                { required: true, message: '请假内容不能为空', trigger: 'blur' },
          ],
          qingjiariqi: [
          ],
          qingjiatianshu: [
                { required: true, message: '请假天数不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          sfsh: [
          ],
          shhf: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
  },
  created() {
	this.ruleForm.qingjiariqi = this.getCurDate()
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='gongyubianhao'){
            this.ruleForm.gongyubianhao = obj[o];
	    this.ro.gongyubianhao = true;
            continue;
          }
          if(o=='gongyumingcheng'){
            this.ruleForm.gongyumingcheng = obj[o];
	    this.ro.gongyumingcheng = true;
            continue;
          }
          if(o=='gongyulouhao'){
            this.ruleForm.gongyulouhao = obj[o];
	    this.ro.gongyulouhao = true;
            continue;
          }
          if(o=='gongyuleibie'){
            this.ruleForm.gongyuleibie = obj[o];
	    this.ro.gongyuleibie = true;
            continue;
          }
          if(o=='gongyuweizhi'){
            this.ruleForm.gongyuweizhi = obj[o];
	    this.ro.gongyuweizhi = true;
            continue;
          }
          if(o=='fangjianlouceng'){
            this.ruleForm.fangjianlouceng = obj[o];
	    this.ro.fangjianlouceng = true;
            continue;
          }
          if(o=='fangjianbianhao'){
            this.ruleForm.fangjianbianhao = obj[o];
	    this.ro.fangjianbianhao = true;
            continue;
          }
          if(o=='fangjianxinxi'){
            this.ruleForm.fangjianxinxi = obj[o];
	    this.ro.fangjianxinxi = true;
            continue;
          }
          if(o=='xingbie'){
            this.ruleForm.xingbie = obj[o];
	    this.ro.xingbie = true;
            continue;
          }
          if(o=='laorenxingming'){
            this.ruleForm.laorenxingming = obj[o];
	    this.ro.laorenxingming = true;
            continue;
          }
          if(o=='laorenbianhao'){
            this.ruleForm.laorenbianhao = obj[o];
	    this.ro.laorenbianhao = true;
            continue;
          }
          if(o=='nianling'){
            this.ruleForm.nianling = obj[o];
	    this.ro.nianling = true;
            continue;
          }
          if(o=='lianxidianhua'){
            this.ruleForm.lianxidianhua = obj[o];
	    this.ro.lianxidianhua = true;
            continue;
          }
          if(o=='qingjianeirong'){
            this.ruleForm.qingjianeirong = obj[o];
	    this.ro.qingjianeirong = true;
            continue;
          }
          if(o=='qingjiariqi'){
            this.ruleForm.qingjiariqi = obj[o];
	    this.ro.qingjiariqi = true;
            continue;
          }
          if(o=='qingjiatianshu'){
            this.ruleForm.qingjiatianshu = obj[o];
	    this.ro.qingjiatianshu = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.xingbie!=''&&json.xingbie){
              		this.ruleForm.xingbie = json.xingbie
		}
		if(json.laorenxingming!=''&&json.laorenxingming){
              		this.ruleForm.laorenxingming = json.laorenxingming
		}
		if(json.laorenbianhao!=''&&json.laorenbianhao){
              		this.ruleForm.laorenbianhao = json.laorenbianhao
		}
		if(json.nianling!=''&&json.nianling){
              		this.ruleForm.nianling = json.nianling
		}
		if(json.lianxidianhua!=''&&json.lianxidianhua){
              		this.ruleForm.lianxidianhua = json.lianxidianhua
		}
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `qingjiaxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}


















      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `qingjiaxinxi/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.qingjiaxinxiCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.qingjiaxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
