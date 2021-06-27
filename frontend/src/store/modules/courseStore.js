import { fetchCourseList } from '@/api/course.js';

const courseStore = {
  namespaced: true,
  state: {
    courseList: []
  },
  getters: {
    fetchedCourseList(state) {
      return state.courseList;
    }
  },
  mutations: {
    SET_COURSE_LIST(state, courseList) {
      state.courseList = courseList;
    }
  },
  actions: {
    async FETCH_COURSE_LIST({commit}) {
      const response = await fetchCourseList();
      commit('SET_COURSE_LIST', response.data);
      return response;
    }
  }
};

export default courseStore;
