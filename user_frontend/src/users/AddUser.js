import axios from 'axios'
import React, { useState } from 'react'
import {Link, useNavigate } from 'react-router-dom'

export default function AddUser() {

let navigate=useNavigate()

    const [user,setUser]=useState({
        name: "",
        userName: "",
        email: ""
    })

    const{name,userName,email} = user

    const onInputChange=(e) =>{
        setUser({...user,[e.target.name]:e.target.value})
    }

    const onSubmit=async (e)=>{
        e.preventDefault();
        axios.post("http://localhost:8080/user", user)
        navigate("/")
    }


  return (
    <div className="container">
         <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-3 mt-2 shadow">
                <h3 className="text-center m-3">Register User</h3>

                <form onSubmit={(e)=>onSubmit(e)}>

                <div className="mb-3">
                    <label htmlFor="Name" className="form-label">Name</label>
                    <input type={"text"} className="form-control" placeholder="Enter Name" name="name" value={name} onChange={(e)=>onInputChange(e)}></input>
                </div>
                <div className="mb-3">
                    <label htmlFor="userName" className="form-label">User Name</label>
                    <input type={"text"} className="form-control" placeholder="Enter User_Name" name="userName" value={userName} onChange={(e)=>onInputChange(e)}></input>
                </div>
                <div className="mb-3">
                    <label htmlFor="text" className="form-label">Email-ID</label>
                    <input type={"email"} className="form-control" placeholder="Enter Email ID" name="email" value={email} onChange={(e)=>onInputChange(e)}></input>
                </div>
                <button type="submit" className="btn btn-outline-primary p-2 m-2">Submit</button>
                <Link  className="btn btn-outline-danger mx-2" to={"/"}>Cancel</Link>
                </form>
            </div>
         </div>
    </div>
  )
}
