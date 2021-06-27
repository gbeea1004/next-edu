<template>
  <div class="homeContainer">
    <h1>Next Edu</h1>
    <div>
      <h2>참여 가능한 과정</h2>
      <ul v-for="course in fetchedCourseList" :key="course.title">
        <li>주제 : {{ course.title }}</li>
        <li>
          <img class="picture" :src="course.pictureUrl" alt="" />
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import { createNamespacedHelpers } from 'vuex';

const { mapGetters } = createNamespacedHelpers('courseStore');

export default {
  computed: {
    ...mapGetters(['fetchedCourseList'])
  },
  created() {
    this.$store.dispatch('courseStore/FETCH_COURSE_LIST');
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
