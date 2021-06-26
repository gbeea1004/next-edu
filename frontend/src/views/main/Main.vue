<template>
  <div class="homeContainer">
    <h1>Next Edu</h1>
    <div>
      <h2>참여 가능한 과정</h2>
      <ul v-for="course in courseList" :key="course.title">
        <li>주제 : {{ course.title }}</li>
        <li>
          <img class="picture" :src="course.picture" alt="" />
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      courseList: []
    };
  },
  created() {
    // 임시 데이터
    let course1 = {
      title: "자바로 만들어보는 장난감 프로젝트",
      picture:
        "https://yt3.ggpht.com/ytc/AAUvwnjrvn97CpfNP72q56YSvLaJJ9kaFtQKpAlBwiHvVg=s900-c-k-c0x00ffffff-no-rj"
    };
    let course2 = {
      title: "스프링으로 웹 어플리케이션 구성하기",
      picture: "https://mblogthumb-phinf.pstatic.net/MjAxNzA4MTZfMTAx/MDAxNTAyODQ2ODU0MzM0.aElbyY76L2BRzSfu10Q4nYGekI2GE7Nv5zpGdoYft3Qg.4RoGfGwjzBd1fodXhp5DYrBMe8QXQd7DWDqvGMeIlXEg.GIF.mujinara/00.gif?type=w800"
    };
    this.courseList.push(course1);
    this.courseList.push(course2);
  }
};
</script>

<style scoped>
ul {
  list-style-type: none;
  padding-left: 0px;
  margin-top: 0px;
  text-align: left;
}
.homeContainer {
  margin: 20px;
}
.picture {
  width: 250px;
  height: 250px;
}
</style>
