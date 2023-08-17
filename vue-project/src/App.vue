<template>
  <div class="app">
    <!-- <data-entry @user-submitted="handleUserSubmitted" />
    <confirmation-page v-if="user" :user="user" /> -->
<router-view :user="user"/>
  </div>
</template>

<script>
// import ConfirmationPage from './components/ConfirmationPage.vue'
// import DataEntry from './components/DataEntry.vue'
export default {
  components: {
    // DataEntry,
    // ConfirmationPage
  },
  data() {
    return {
      user: null // Initialize user data as null
    };
  },
  methods: {
    handleUserSubmitted(user) {
      this.user = user; // Update user data when submitted
    }
  }
}
</script>

<style>

</style>
