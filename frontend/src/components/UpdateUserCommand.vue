<template>

    <v-card outlined>
        <v-card-title>
            UpdateUser
        </v-card-title>

        <v-card-text>
            <string offline label="UserId" v-model="value.userId" :editMode="editMode" @change="change"/>
            <string offline label="UserName" v-model="value.userName" :editMode="editMode" @change="change"/>
            <string offline label="UserEmail" v-model="value.userEmail" :editMode="editMode" @change="change"/>
            <string offline label="UserPassword" v-model="value.userPassword" :editMode="editMode" @change="change"/>
            <string offline label="UserRole" v-model="value.userRole" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateUser"
            >
                UpdateUser
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateUserCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.userId = {};
            this.value.userName = {};
            this.value.userEmail = {};
            this.value.userPassword = {};
            this.value.userRole = {};
        },
        watch: {
        },
        methods: {
            updateUser() {
                this.$emit('updateUser', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

