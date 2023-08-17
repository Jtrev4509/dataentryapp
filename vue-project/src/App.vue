<template>
  <div class="app">
   
<router-view :user="user"/>
  </div>
</template>

<script>

export default {
  components: {
   
  },
  data() {
    return {
      user: null 
    };
  },
  methods: {
    handleUserSubmitted(user) {
      this.user = user;
    }
  }
}
</script>

<style>

</style>
