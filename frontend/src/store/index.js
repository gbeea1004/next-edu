import Vue from 'vue';
import Vuex from 'vuex';
import courseStore from '@/store/modules/courseStore.js';

Vue.use(Vuex);

const store = new Vuex.Store({
  modules: {
    courseStore
  }
});

export default store;