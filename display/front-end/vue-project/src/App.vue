<script>
  import Aside from './components/Aside.vue'
  import Main from './components/Main.vue'
  
  export default{
    components: {
      Aside,
      Main
    }
  }

</script>

<template>
  <div class="common-layout">
    <el-container>
      <el-header style="padding: 0;">
        <div id="header">
          <el-text class="project-title" id="project-title" size="large">加密流量的分类识别</el-text>
        </div>
      </el-header>
      <el-container>
        <el-aside style="width: 200px; padding: 0;">
          <Aside />
        </el-aside>
        <el-main>
          <Main />
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<style scoped>
  div{
    text-align: center;
  }
  #header{
    padding: 0;
    display: flex;
    justify-content: center;
    height: 60px;
    width: calc(100vw);
    background-color:#409EFF;
    border-radius: 15px;
  }
  #project-title{
    line-height: 30px;
    height:30px;
    width: 200px;
    color:#303133;
    margin-top: auto;
    margin-bottom: auto;
    border-radius: 10px;
    background-color: #E6A23C;
    font-weight: bold;
  }
  el-main{
    align-items: center;
  }
</style>